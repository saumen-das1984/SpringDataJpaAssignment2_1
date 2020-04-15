package com.udemy.springframework.datajpa.app.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.springframework.datajpa.app.domain.Address;
import com.udemy.springframework.datajpa.app.domain.Publisher;
import com.udemy.springframework.datajpa.app.repository.AddressRepository;
import com.udemy.springframework.datajpa.app.repository.PublisherRepository;


@Component
public class BootStrapData implements CommandLineRunner{
	
	private final AddressRepository addressRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AddressRepository addressRepository, PublisherRepository publisherRepository) {
        this.addressRepository = addressRepository;
        this.publisherRepository = publisherRepository;
    }

	@Override
	public void run(String... args) throws Exception {
		Address addr = new Address("08 Major Arterial Road", "NewTown", "West Bengal", 700156);
		Publisher publr = new Publisher("Dey Book Publisher");
		publr.getAddress().add(addr);
		addr.getPublisher().add(publr);
		
		addressRepository.save(addr);
		publisherRepository.save(publr);

		Address address1 = new Address("12/C Durgrabari Road", "Dumdum Cantonment", "West Bengal", 700028);
		Publisher publisher1 = new Publisher("Dey Book Publisher");
		publisher1.getAddress().add(address1);
		address1.getPublisher().add(publisher1);
		
		addressRepository.save(address1);
		publisherRepository.save(publisher1);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Publishers: " + publisherRepository.count());
		
	}

}
