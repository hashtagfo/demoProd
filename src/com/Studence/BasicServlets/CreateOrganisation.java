/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Studence.BasicServlets;

import com.Studence.helper.RandomString;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.inject.Named;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author shubham
 */
@WebServlet("/CreateOrganisation")
public class CreateOrganisation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        JsonObjectBuilder organisation = Json.createObjectBuilder();
        
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        JsonObjectBuilder orgBuilder = Json.createObjectBuilder();
        JsonObject data = orgBuilder.add("OrgId",genreateID())
			.add("OrgCode","")
			.add("OrgEnum","")
			.add("OrgName","")
                        .add("OrgPhoneNo1","")
		.add("OrgPhoneNo2","")
                .add("OrgEmail","")
                .add("OrgAddress","")
                .add("OrgUsername","").add("OrgDomain","")
                .add("OrgPassword","")
                .add("OrgWebsite","")
                .build();
			
			// add the plant to our array of plants.
			arrayBuilder.add(data);
        
        JsonObject root = organisation.add("plants", arrayBuilder).build();
        PrintWriter writer = response.getWriter();
        writer.print(root);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "To create and edit a Organisation ";
    }// </editor-fold>
    
    private String genreateID()
    {
        return new RandomString(4).toString();
    }

}
