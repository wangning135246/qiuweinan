package com.hd.dao;

import com.hd.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 这个是登陆的账号密码的方法
     * @param account
     * @param pwd
     * @return
     */
     User login(@Param("account") String account, @Param("pwd") String pwd);

    /**
     * 查询用户角色的ID
     * @param userId
     * @return
     */
     Integer selectUserRole(@Param("userId") Integer userId);

    /**
     * 查询用户的角色名字
     * @param roleId
     * @return
     */
     String selectRoleName(@Param("roleId") Integer roleId);

    /**
     * 查询该站点下的医生和站点管理员
     * @param siteName
     * @return
     */
     List<Integer> selectSiteCount(@Param("siteName")String siteName);

    /**
     * 这个是修改用户表中属于该站点的用户的站点都设置为0
     * @param sitename
     * @return
     */
     Integer modifyUserSite(@Param("sitename")String sitename);

    /**
     * 在新建站点的时候修改的医生和站点管理员所属站点
     * @param name
     * @param siteName
     * @return
     */
     int modifyUserSiteName(@Param("name")String name,@Param("siteName")String siteName);

    /**
     * 查询出所有用户的方法
     * @return
     */
    List<User> selectAllUser();

    /**
     * 根据站点管理员的名字查询信息的方法
     * @param name
     * @return
     */
    User selectSiteAdmin(@Param("name")String name);

    /**
     * 修改分站管理员的方法
     * @param id
     * @param name
     * @param phone
     * @return
     */
    int modifyAdminUser(@Param("id")String id,@Param("name")String name,@Param("phone")String phone);

    /**
     * 根据输入的名字查询的方法
     * @param name
     * @return
     */
    List<User> selectBeautifulUSer(@Param("name")String name);

    /**
     * 添加分站管理员的方法
     * @return
     */
    int insertAdminUser(@Param("name")String name,@Param("account")String account,
                        @Param("password")String password,@Param("phone")String phone,
                        @Param("sitename")String sitename,@Param("address")String address);

    /**
     * 添加角色的方法
     * @param userId
     * @param roleId
     * @return
     */
    int insertAuth_user_role(@Param("userId")String userId,@Param("roleId")String roleId);
}
