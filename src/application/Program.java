package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		/* SellerDao sellerDao = DaoFactory.createSellerDao(); 
		Seller seller = sellerDao.findById(3); //find by ID
		System.out.println(seller);	
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep); //find by department
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		list = sellerDao.findAll(); // find all
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		
		sellerDao.insert(newSeller); //Insert seller
		System.out.println("Inserted! New Id: " + newSeller.getId());
		
		newSeller.setName("Gregorio");
		sellerDao.update(newSeller);
		
		System.out.println("Updated: " + newSeller); //Update seller
		
		sellerDao.DeleteById(13);
		
		System.out.println("Delete! Remain:\n" + sellerDao.findAll()); */
		
		// DEPARTMENT DAO
		
		DepartmentDao departmentDao= DaoFactory.createDepartmentDao();
		
		Department newDepartment = new Department(5, "Musics");
		
		Department dep = departmentDao.findById(2);
		
		System.out.println("Find! " + departmentDao.findAll());
	}

}
