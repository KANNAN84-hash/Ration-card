package rationcard;



public class RationCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserManagement.initialMembers(); // initially all the members gets added creating the ration card
		
	
		String name ="R.Revathy";
		UserManagement.addMember(name);//add a single member to the card
	
		String name1="Mrs.Santhi";
	    UserManagement.removeMember(name1);// remove a member in the card
	
		String name2="Mrs.Santhi";
		String name3="Mrs.Shanthi";
		UserManagement.update(name2,name3);// one name gets changed by another name
		UserManagement.displayMembers();// display all the members
		String name4 = "R.Revathy";
		boolean result=UserManagement.namePresent(name4);//check whether the particular name is present 
		                                                   
        System.out.println(result);
        
		
	}

}
