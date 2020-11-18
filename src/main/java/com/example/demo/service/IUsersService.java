package com.example.demo.service;

import com.example.demo.entity.vo.Users;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zuoruibo
 * @since 2020-11-18
 */
public interface IUsersService extends IService<Users> {
	public List<Users> listDbInfo();
}
