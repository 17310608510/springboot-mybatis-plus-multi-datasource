package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.vo.Users;
import com.example.demo.service.IUsersService;
import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;

import io.swagger.annotations.ApiOperation;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zuoruibo
 * @since 2020-11-18
 */
@RestController
@RequestMapping("/demo/users")
public class UsersController {
	@Autowired
	private IUsersService usersService;

	@ApiOperation(value = "获得用户列表信息", httpMethod = "POST")
	@PostMapping("/listDbInfo")
	public JsonResult listDbInfo() {
		List<Users> dataList = this.usersService.listDbInfo();
		if (dataList == null || dataList.size() == 0) {
			return new JsonResult(ResultCode.SUCCESS_FAIL);
		}
		return new JsonResult(ResultCode.SUCCESS, dataList);
	}
}
