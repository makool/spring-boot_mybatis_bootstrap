package com.gdut.dongjun.domain.po.authc;

public class UserRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.user_id
     *
     * @mbggenerated Sat Nov 14 14:40:29 CST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.role_id
     *
     * @mbggenerated Sat Nov 14 14:40:29 CST 2015
     */
    private String roleId;

    public UserRoleKey() {
		super();
	}

	public UserRoleKey(String userId2, String r) {
    	
    	this.userId = userId2;
    	this.roleId = r;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.user_id
     *
     * @return the value of user_role.user_id
     *
     * @mbggenerated Sat Nov 14 14:40:29 CST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.user_id
     *
     * @param userId the value for user_role.user_id
     *
     * @mbggenerated Sat Nov 14 14:40:29 CST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.role_id
     *
     * @return the value of user_role.role_id
     *
     * @mbggenerated Sat Nov 14 14:40:29 CST 2015
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.role_id
     *
     * @param roleId the value for user_role.role_id
     *
     * @mbggenerated Sat Nov 14 14:40:29 CST 2015
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}