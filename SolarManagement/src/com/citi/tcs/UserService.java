package com.citi.tcs;

import java.util.List; 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/UserService") 

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<User> getUsers(){ 
      return userDao.getAllUsers(); 
   }  
   
   
   @POST
   @Path("/usesPost/add")
   @Produces(MediaType.APPLICATION_XML)
   public User addUser() {
	   return userDao.addUser();
   }
   
   @PUT
   @Path("/usesPemissions/Structural")
   @Produces(MediaType.APPLICATION_XML)
   public UserPermissions updateUser1() {
	   return userDao.updateStructuralPermissions();
   }
   
   @PUT
   @Path("/usesPermissions/Electrical")
   @Produces(MediaType.APPLICATION_XML)
   public UserPermissions updateUser() {
	   return userDao.updateElectricalPermissions();
   }
   
}
