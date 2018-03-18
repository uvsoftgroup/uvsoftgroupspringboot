package uvsoftgroup.springcloud.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;

@Entity
public class UserRole implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @TableGenerator(name="ur_seq",table="urseqtable",
	 pkColumnName="urkey", pkColumnValue="urvalue", initialValue=200,allocationSize=1)
	 @GeneratedValue(strategy=GenerationType.TABLE, generator="ur_seq")
	 Long userRoleId;
	 String userRoleName;
	 String userRoleType;
	 Date userRoleDate;
	 
	 @ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	  @JoinColumn(name="user_id")
	  private UserRegistration userRegistration;
	  

	public UserRole() {
		super();
		
	}

	
	public UserRole(Long userRoleId, String userRoleName, String userRoleType, Date userRoleDate,
			UserRegistration userRegistration) {
		super();
		this.userRoleId = userRoleId;
		this.userRoleName = userRoleName;
		this.userRoleType = userRoleType;
		this.userRoleDate = userRoleDate;
		this.userRegistration = userRegistration;
	}


	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public String getUserRoleType() {
		return userRoleType;
	}

	public void setUserRoleType(String userRoleType) {
		this.userRoleType = userRoleType;
	}

	public Date getUserRoleDate() {
		return userRoleDate;
	}

	public void setUserRoleDate(Date userRoleDate) {
		this.userRoleDate = userRoleDate;
	}

	public UserRegistration getUserRegistration() {
		return userRegistration;
	}

	public void setUserRegistration(UserRegistration userRegistration) {
		this.userRegistration = userRegistration;
	}
	 
	
}
