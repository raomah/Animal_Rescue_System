/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EcoSystem;


import Business.Network.NetworkDetails;
import Business.Organisation.OrganisationMain;
import Business.Role.AllRoles;
import Business.Role.SystemAdministratorRole;
import Business.UserAccount.VisitorAccountDetails;
import Business.UserAccount.VisitorAccountDetailsDirectory;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends OrganisationMain{

    private static EcoSystem business;
    private ArrayList<NetworkDetails> networkList;
    private VisitorAccountDetailsDirectory visitorAccountDir;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<NetworkDetails>();
        visitorAccountDir = new VisitorAccountDetailsDirectory();
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();           
        }
        return business;
    }
    
    public ArrayList<NetworkDetails> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<NetworkDetails> networkList) {
        this.networkList = networkList;
    }

    public VisitorAccountDetailsDirectory getVisitorAccountDir() {
        return visitorAccountDir;
    }

    public void setVisitorAccountDir(VisitorAccountDetailsDirectory visitorAccountDir) {
        this.visitorAccountDir = visitorAccountDir;
    }
    
    public NetworkDetails createAndAddNetwork(){
        NetworkDetails network=new NetworkDetails();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<AllRoles> getSupportedRole() {
        ArrayList<AllRoles> roleList=new ArrayList();
        roleList.add(new SystemAdministratorRole());
        return roleList;
    }
    
    public boolean checkIfUserNameIsUnique(String username){
        if(!this.getUserAccountDir().checkIfUsernameIsUnique(username)){
            return false;
        }
        for(NetworkDetails network:networkList){
            
        }
        return true;
    }
    
}

