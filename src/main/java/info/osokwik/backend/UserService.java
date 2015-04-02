package info.osokwik.backend;

import info.osokwik.domain.User;
import info.osokwik.util.HibernateUtil;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;

@Path("/user")
public class UserService {
	
	 @GET
	 @Path("/all")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<User> getUsers() {
		 Session session = null;
		 try {
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();

			 String sql = "FROM User";
			 Query q = session.createQuery(sql);
			 return q.list();
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 session.getTransaction().commit();
		 }
 
		 return null;
	}

}
