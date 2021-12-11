/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organisation.OrganisationMain;
import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author raomah
 */
public abstract class EnterpriseDetails extends OrganisationMain{
    private EnterpriseType enterpriseType;
    private OrganisationDirectory organisationDirectory;
    
    public EnterpriseDetails(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organisationDirectory = new OrganisationDirectory();
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }
    
    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public enum EnterpriseType {
        RescueCenter("Rescue");
            
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
        
    }
}
