package HumanResourceSystemService;

import HrInterface.EmployeeI;
import HumanResourceManagementSystem.BeansHr.ProjectManager;
import com.myclasses.ResponseMessage;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by DANCO on 12/04/2017.
 */
@Path("/humanResource")
public class HrmService {
    @EJB
    EmployeeI e;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/danco")
    public Response getEmployeeHistory(ProjectManager p){


        return Response.status(200).entity(e.EmployeeHistory()).build();
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/simiyud")
    public ResponseMessage insertWorkDetails(ProjectManager p){
        ResponseMessage re = new ResponseMessage();
        if (p.InsertData()){
            re.setStatus(true);
            re.setMessage("FAILED");
            re.setData(p);

        }else {
            re.setStatus(false);
            re.setMessage("SUCCESS");
            re.setData(p);
        }
        return re;
    }
}
