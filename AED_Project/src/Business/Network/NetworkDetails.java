/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprises.EnterpriseDetailsDirectory;

/**
 *
 * @author raomah
 */
public class NetworkDetails {
    private String name;
    private EnterpriseDetailsDirectory enterpriseDirectory;

    public NetworkDetails() {
        enterpriseDirectory = new EnterpriseDetailsDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDetailsDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDetailsDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
