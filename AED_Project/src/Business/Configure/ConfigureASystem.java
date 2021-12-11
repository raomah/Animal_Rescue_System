/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configure;


import Business.Adopt.AddressDetails;
import Business.Adopt.AdopterDetail;
import Business.Animals.AnimalDetails;
import Business.Animals.DogDetails;
import Business.Cages.CageDetail;
import Business.Cages.CageDetailsDirectory;
import Business.Date.Date;
import Business.EcoSystem.EcoSystem;
import Business.Employees.EmployeeDetails;
import Business.Employees.EmployeeDetailsDirectory;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.EnterpriseDetailsDirectory;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Medicines.AnestheticsDetails;
import Business.Medicines.AntibioticsDetails;
import Business.Medicines.MedicineDetails;
import static Business.Medicines.MedicineDetails.MedicineType.Anesthetics;
import Business.Medicines.MedicineDetailsDirectory;
import Business.Medicines.OtherMedicineDetails;
import Business.Medicines.VaccinationDetails;
import Business.Network.NetworkDetails;
import Business.Organisation.AdoptionOrganisation;
import Business.Organisation.OrganisationMain;
import Business.Organisation.OrganisationDirectory;
import Business.RescueRecord.RescueRecordDetails;
import Business.Role.AdoptionManagerRole;
import Business.Role.DeliveryPersonRole;
import Business.Role.PharmacistRole;
import Business.Role.ReceptionistRole;
import static Business.Role.AllRoles.RoleType.AdoptionInspector;
import Business.Role.ShelterEmpRole;
import Business.Role.SystemAdministratorRole;
import Business.Role.VetAssistantRole;
import Business.Role.VeterinarianRole;
import Business.Place.PlaceDetails;
import Business.Place.PlaceDetailsDirectory;
import Business.ShelterCell.ShelterCellDetails;
import Business.ShelterCell.ShelterCellDetailsDirectory;
import Business.UserAccount.UserAccountDetails;
import Business.UserAccount.UserAccountDetailsDirectory;
import Business.UserAccount.VisitorAccountDetails;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        ArrayList<NetworkDetails> networkList=new ArrayList<NetworkDetails>();
        system.setNetworkList(networkList);
        
        NetworkDetails network = new NetworkDetails();
        network.setName("Boston");
        networkList.add(network);
        
        EnterpriseDetailsDirectory enterpriseDir = network.getEnterpriseDirectory();
        RescueCenterEntDetails enterpriseRescueCenter = (RescueCenterEntDetails)enterpriseDir.createAndAddEnterprise("Rescue Center", EnterpriseDetails.EnterpriseType.RescueCenter);
        network.setEnterpriseDirectory(enterpriseDir);
        
        OrganisationDirectory organizationDir=new OrganisationDirectory();
        enterpriseRescueCenter.setOrganisationDirectory(organizationDir);
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        OrganisationMain orgVete = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.Vete);
        OrganisationMain orgAdmin = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.EnterpriseAdmin);
        OrganisationMain orgAdoption = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.Adoption);
        OrganisationMain orgCage = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.Cage);
        OrganisationMain orgCenterRegistration = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.CenterRegistration);
        OrganisationMain orgDelivery = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.Delivery);
        OrganisationMain orgPharmacy = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.Pharmacy);
        OrganisationMain orgShelter = enterpriseRescueCenter.getOrganisationDirectory().createOrganization(OrganisationMain.Type.Shelter);

                
        EmployeeDetails sysadminEmployee = system.getEmployeeDir().createEmployee("Professor");
        UserAccountDetails ua = system.getUserAccountDir().createUserAccount("sysadmin", "sysadmin", sysadminEmployee, new SystemAdministratorRole());
        ua.setEmployee(sysadminEmployee);

        //UserAccountDir uadsys = new UserAccountDetailsDirectory();
        
        //UserAccountDir uadcr = new UserAccountDetailsDirectory();
        //orgCenterRegistration.setUserAccountDirectory(uadcr);
        //EmployeeDir ed1 = new EmployeeDetailsDirectory();
        //orgCenterRegistration.setEmployeeDirectory(ed1);
        
        /*
        EmployeeDetails receptionist = system.getEmployeeDirectory().createEmployee("Qing");
        UserAccountDetails ua1 = system.getUserAccountDirectory().createUserAccount("re", "re", receptionist, new ReceptionistRole());
        ua1.setEmployee(receptionist);
        orgCenterRegistration.getUserAccountDirectory().getUserAccountList().add(ua1);
        orgCenterRegistration.getEmployeeDirectory().getEmployeeList().add(receptionist);
        //UserAccountDir uadv = new UserAccountDetailsDirectory();
        //orgCenterRegistration.setUserAccountDirectory(uadv);
        //EmployeeDir ed2 = new EmployeeDetailsDirectory();
        
        EmployeeDetails veterinarian = system.getEmployeeDirectory().createEmployee("Xuan");
        UserAccountDetails ua2 = system.getUserAccountDirectory().createUserAccount("ve", "ve", veterinarian, new VeterinarianRole());
        ua2.setEmployee(veterinarian);
        orgVete.getUserAccountDirectory().getUserAccountList().add(ua2);
        orgVete.getEmployeeDirectory().getEmployeeList().add(veterinarian);
        
        EmployeeDetails pharmacist = system.getEmployeeDirectory().createEmployee("Hang");
        UserAccountDetails ua3 = system.getUserAccountDirectory().createUserAccount("ph", "ph", pharmacist, new PharmacistRole());
        ua3.setEmployee(pharmacist);
        orgPharmacy.getUserAccountDirectory().getUserAccountList().add(ua3);
        orgPharmacy.getEmployeeDirectory().getEmployeeList().add(pharmacist);
        
        EmployeeDetails shelterStaff = system.getEmployeeDirectory().createEmployee("Vijayashree");
        UserAccountDetails ua4 = system.getUserAccountDirectory().createUserAccount("sh", "sh", shelterStaff, new ShelterEmpRole());
        ua4.setEmployee(shelterStaff);
        orgShelter.getUserAccountDirectory().getUserAccountList().add(ua4);
        orgShelter.getEmployeeDirectory().getEmployeeList().add(shelterStaff);
        
        EmployeeDetails adoptionInspector = system.getEmployeeDirectory().createEmployee("Rajput");
        UserAccountDetails ua5 = system.getUserAccountDirectory().createUserAccount("ad", "ad", adoptionInspector, new AdoptionManagerRole());
        ua5.setEmployee(adoptionInspector);
        orgAdoption.getUserAccountDirectory().getUserAccountList().add(ua5);
        orgAdoption.getEmployeeDirectory().getEmployeeList().add(adoptionInspector);
        
        EmployeeDetails delivery = system.getEmployeeDirectory().createEmployee("Avee");
        UserAccountDetails ua6 = system.getUserAccountDirectory().createUserAccount("de", "de", delivery, new DeliveryPersonRole());
        ua6.setEmployee(delivery);
        orgDelivery.getUserAccountDirectory().getUserAccountList().add(ua6);
        orgDelivery.getEmployeeDirectory().getEmployeeList().add(delivery);
        
        EmployeeDetails veteAssistant=system.getEmployeeDirectory().createEmployee("Ming");
        UserAccountDetails ua7=system.getUserAccountDirectory().createUserAccount("veteAssistant", "veteAssistant", veteAssistant, new VetAssistantRole());
        ua7.setEmployee(veteAssistant);
        orgCage.getUserAccountDirectory().getUserAccountList().add(ua7);
        orgCage.getEmployeeDirectory().getEmployeeList().add(veteAssistant);
        */
        
        MedicineDetailsDirectory medicineDir = new MedicineDetailsDirectory();
        AnestheticsDetails m1 = new AnestheticsDetails();
        m1.setMedname("ane1");
        m1.setMedtype(MedicineDetails.MedicineType.Anesthetics);
        m1.setMedvendor("ane1");
        AntibioticsDetails m2 = new AntibioticsDetails();
        m2.setMedname("ant1");
        m2.setMedtype(MedicineDetails.MedicineType.Antibiotics);
        m2.setMedvendor("ant1");
        OtherMedicineDetails m3 = new OtherMedicineDetails();
        m3.setMedname("other1");
        m3.setMedtype(MedicineDetails.MedicineType.Other);
        m3.setMedvendor("other1");
        VaccinationDetails m4 = new VaccinationDetails();
        m4.setMedname("vac1");
        m4.setMedtype(MedicineDetails.MedicineType.Vaccination);
        m4.setMedvendor("vac1");
        enterpriseRescueCenter.setMedicineDirectory(medicineDir);
        
        for(int i=0;i<10;i++) {
            CageDetail c = new CageDetail();
            c.setCagelocation("f1 c" + String.valueOf(i+1));
            c.setCagestatus(CageDetail.AVAIL_STATUS);
            enterpriseRescueCenter.getCageCellDirectory().addCageShell(c);
        }
        
        for(int i=0;i<50;i++) {
            ShelterCellDetails c = new ShelterCellDetails();
            c.setShelterlocation("f1 c" + String.valueOf(i+1));
            c.setShelterstatus(ShelterCellDetails.AVAIL_STATUS);
            enterpriseRescueCenter.getShelterCellDirectory().addShelterShell(c);
        }
        
        AdopterDetail adopter = new AdopterDetail();
        adopter.setFirstName("Zesheng");
        adopter.setLastName("Zong");
        adopter.setEmail("zong.zesheng@husky.neu.edu");
        adopter.setPhoneNumber("888-888-8888");
        adopter.setSsnnumber("111111111");
        AddressDetails address = new AddressDetails();
        address.setStreetName("650 Huntington St");
        address.setCityName("Boston");
        address.setStateName("MA");
        adopter.setAddress(address);
        system.getVisitorAccountDir().createUserAccount("adopter", "adopter", adopter);
        ((AdoptionOrganisation)orgAdoption).getAdopterDirectory().addAdoptor(adopter);
        RescueRecordDetails rr = new RescueRecordDetails();
        
        Date date = new Date();
        date.setYear(2016);
        date.setMonth(12);
        date.setDate(10);
        rr.setDate(date);
        
        AnimalDetails animal = new DogDetails();
        animal.setAnimalcolor("white");
        animal.setAnimalgender("male");
        animal.setAnimaltype(AnimalDetails.AnimalType.Dog);
        animal.setAnimalstatus(AnimalDetails.UNREADY_STATUS);
        rr.setRescuedanimal(animal);
        
        rr.setFoundlocation("Malden");
        enterpriseRescueCenter.getRecordDirectory().addRescueRecord(rr);
        
        return system;
    }

   
    
}

