/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprises.EnterpriseDetails;
import Business.Enterprises.RescueCenterEntDetails;
import Business.Organisation.OrganisationMain;
import Business.Organisation.VeterinarianOrganisation;
import Business.UserAccount.UserAccountDetails;
import Interface.VetRole.VeterinarianWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class VeterinarianRole extends AllRoles {
    public JPanel createWorkArea(JPanel container, 
            EnterpriseDetails enterprise, 
            OrganisationMain organization, 
            UserAccountDetails userAccount, 
            EcoSystem business) {
        return new VeterinarianWorkAreaJPanel(container, (RescueCenterEntDetails)enterprise, (VeterinarianOrganisation)organization, userAccount);
    }
}
