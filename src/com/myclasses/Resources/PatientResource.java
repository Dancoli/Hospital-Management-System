//package com.myclasses.Resources;
//
//import com.ClinicInterfaces.ReceptionistInterface;
//import com.myclasses.Patient;
//import com.myclasses.ResponseMessage;
//
//import javax.ejb.EJB;
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
///**
// * Created by DANCO on 10/04/2017.
// */
//@Path("/patient")
//public class PatientResource {
//    @EJB
//    ReceptionistInterface r;
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/dan")
//    public Response getPatientDetails(){
//
//       return Response.status(200).entity(r.viewPatientsData()).build();
//    }
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Path("/simiyu")
//    public ResponseMessage insertPatientDetails(Patient patient){
//        ResponseMessage re = new ResponseMessage();
//        if (r.insertData(patient)){
//            re.setStatus(true);
//            re.setMessage("FAILED");
//            re.setData(patient);
//
//        }else {
//            re.setStatus(false);
//            re.setMessage("SUCCESS");
//            re.setData(patient);
//        }
//        return re;
//    }
//}
