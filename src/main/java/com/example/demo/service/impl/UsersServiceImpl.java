package com.example.demo.service.impl;

import com.example.demo.entity.vo.Users;
import com.example.demo.dao.UsersMapper;
import com.example.demo.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuoruibo
 * @since 2020-11-18
 */
@Service
//@DS("slave_1")
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

	@Override
//	@DS("master")
	public List<Users> listDbInfo() {
		// TODO Auto-generated method stub
		return this.baseMapper.listDbInfo();
	}

}
