package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.Section;
import com.lambdaschool.usermodel.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "sectionService")
public class SectionServiceImplementation implements SectionService {

    @Autowired
    SectionRepository sectionRepository;

    @Override
    public Section save(Section section) {
        return sectionRepository.save(section);
    }
}
