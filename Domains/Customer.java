package domains;
class Customer {
private int CustomerId;
private String Name;
private String Password;
private String email;
private String favRestaurant;
public Customer(int customerId, String name, String password, String email) {
	super();
	CustomerId = customerId;
	Name = name;
	Password = password;
	this.email = email;
}
public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFavRestaurant() {
	return favRestaurant;
}
public void setFavRestaurant(String favRestaurant) {
	this.favRestaurant = favRestaurant;
}

}
