package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Owner;
import com.example.rentalAgency.repository.OwnerRepository;
import com.example.rentalAgency.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OwnerImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Owner addOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public List<Owner> findAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner updateOwner(Long id, Owner owner) {
        Owner owner1=ownerRepository.findById(id).get();

        owner1.setEmail(owner.getEmail());
        owner1.setName(owner.getName());
        owner1.setUsername(owner.getUsername());
        owner1.setPassword(owner.getPassword());
        return ownerRepository.save(owner1);

    }

    @Override
    public void deleteOwner(Long id) {
        ownerRepository.deleteById(id);
    }
}
