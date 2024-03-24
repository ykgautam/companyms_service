package com.yash.companyms.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    Boolean updateCompany(Company company,Long id);

    void addCompany(Company company);

    Boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}
