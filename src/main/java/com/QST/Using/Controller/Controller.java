/*Copyright ©2016 TommyLemon(https://github.com/TommyLemon/APIJSON)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package com.QST.Using.Controller;

import com.QST.Using.Etitys.*;
import com.QST.Using.Util.APIJSON.DemoParser;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import zuo.biao.apijson.*;
import zuo.biao.apijson.RequestMethod;
import zuo.biao.apijson.server.JSONRequest;
import zuo.biao.apijson.server.exception.ConditionErrorException;
import zuo.biao.apijson.server.exception.ConflictException;
import zuo.biao.apijson.server.exception.NotExistException;
import zuo.biao.apijson.server.exception.OutOfRangeException;

import javax.servlet.http.HttpSession;
import java.net.URLDecoder;
import java.util.Random;
import java.util.concurrent.TimeoutException;

import static zuo.biao.apijson.RequestMethod.*;


/**request controller
 * <br > 建议全通过HTTP POST来请求:
 * <br > 1.减少代码 - 客户端无需写HTTP GET,PUT等各种方式的请求代码
 * <br > 2.提高性能 - 无需URL encode和decode
 * <br > 3.调试方便 - 建议使用 APIJSON在线测试工具 或 Postman
 * @author Lemon
 */
@RestController
@RequestMapping("")
public class Controller {
	private static final String TAG = "Controller";

	//通用接口，非事务型操作 和 简单事务型操作 都可通过这些接口自动化实现<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


	/**获取
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#GET}
	 */
	@PostMapping(value = "get")
	@GetMapping(value = "get")
	public String get(@RequestBody String request, HttpSession session) {
		System.out.println("hahahahahahahaha-------------------"+request);
		return new DemoParser(GET).setSession(session).parse(request);
	}

	/**计数
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#HEAD}
	 */
	@PostMapping("head")
	public String head(@RequestBody String request, HttpSession session) {
		return new DemoParser(HEAD).setSession(session).parse(request);
	}

	/**限制性GET，request和response都非明文，浏览器看不到，用于对安全性要求高的GET请求
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#GETS}
	 */
	@PostMapping("gets")
	public String gets(@RequestBody String request, HttpSession session) {
		return new DemoParser(GETS).setSession(session).parse(request);
	}

	/**限制性HEAD，request和response都非明文，浏览器看不到，用于对安全性要求高的HEAD请求
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#HEADS}
	 */
	@PostMapping("heads")
	public String heads(@RequestBody String request, HttpSession session) {
		return new DemoParser(HEADS).setSession(session).parse(request);
	}

	/**新增
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#POST}
	 */
	@PostMapping("post")
	public String post(@RequestBody String request, HttpSession session) {
		return new DemoParser(POST).setSession(session).parse(request);
	}

	/**修改
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#PUT}
	 */
	@PostMapping("put")
	public String put(@RequestBody String request, HttpSession session) {
		return new DemoParser(PUT).setSession(session).parse(request);
	}

	/**删除
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#DELETE}
	 */
	@PostMapping("delete")
	public String delete(@RequestBody String request, HttpSession session) {
		return new DemoParser(DELETE).setSession(session).parse(request);
	}





	/**获取
	 * 只为兼容HTTP GET请求，推荐用HTTP POST，可删除
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#GET}
	 */
	@RequestMapping("get/{request}")
	public String openGet(@PathVariable String request, HttpSession session) {
		try {
			request = URLDecoder.decode(request, StringUtil.UTF_8);
		} catch (Exception e) {
			// Parser会报错
		}
		return get(request, session);
	}

	/**计数
	 * 只为兼容HTTP GET请求，推荐用HTTP POST，可删除
	 * @param request 只用String，避免encode后未decode
	 * @param session
	 * @return
	 * @see {@link RequestMethod#HEAD}
	 */
	@RequestMapping("head/{request}")
	public String openHead(@PathVariable String request, HttpSession session) {
		try {
			request = URLDecoder.decode(request, StringUtil.UTF_8);
		} catch (Exception e) {
			// Parser会报错
		}
		return head(request, session);
	}


	//通用接口，非事务型操作 和 简单事务型操作 都可通过这些接口自动化实现>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>













	public static final String USER_;
	static {
		USER_ = User.class.getSimpleName();
	}

	public static final String VERSION = JSONRequest.KEY_VERSION;
	public static final String FORMAT = JSONRequest.KEY_FORMAT;
	public static final String COUNT = JSONResponse.KEY_COUNT;
	public static final String TOTAL = JSONResponse.KEY_TOTAL;

	public static final String RANGE = "range";

	public static final String ID = "id";
	public static final String USER_ID = "userId";
	public static final String CURRENT_USER_ID = "currentUserId";

	public static final String NAME = "name";
	public static final String PHONE = "phone";
	public static final String PASSWORD = "password";
	public static final String _PASSWORD = "_password";
	public static final String _PAY_PASSWORD = "_payPassword";
	public static final String OLD_PASSWORD = "oldPassword";
	public static final String VERIFY = "verify";

	public static final String SEX = "sex";
	public static final String TYPE = "type";
	public static final String WAY = "way";
	public static final String CONTENT = "content";
	




	public static final String DATE_UP = "date+";//同 "date ASC"
	public static final String DATE_DOWN = "date-";//同 "date DESC"

	public static final String ID_AT = ID + "@";
	public static final String USER_ID_AT = USER_ID + "@";
	public static final String MOMENT_ID_AT = "momentId@";
	public static final String COMMENT_ID_AT = "commentId@";

	public static final String ID_IN = ID + "{}";
	public static final String USER_ID_IN = USER_ID + "{}";
	public static final String MOMENT_ID_IN = "momentId{}";
	public static final String COMMENT_ID_IN = "commentId{}";

	public static final String NAME_SEARCH = NAME + "$";
	public static final String PHONE_SEARCH = PHONE + "$";
	public static final String CONTENT_SEARCH = CONTENT + "$";



	public static final String COLUMNS_USER_SIMPLE = "id,name";
	public static final String COLUMNS_USER = "id,sex,name,head";








	public static final String LOGIN = "login";

	public static final int LOGIN_TYPE_PASSWORD = 0;//密码登录
	public static final int LOGIN_TYPE_VERIFY = 1;//验证码登录
	/**用户登录
	 * @param request 只用String，避免encode后未decode
	 * @return
	 * @see
	 * <pre>
		{
			"type": 0,  //登录方式，非必须  0-密码 1-验证码
			"phone": "13000082001",
			"password": "1234567",
			"version": 1 //全局版本号，非必须
		}
	 * </pre>
	 */
//	@PostMapping(LOGIN)
//	public JSONObject login(@RequestBody String request, HttpSession session) {
//		JSONObject requestObject = null;
//		boolean isPassword;
//		String phone;
//		String password;
//		int version;
//		Boolean format;
//		try {
//			requestObject = DemoParser.parseRequest(request);
//
//			isPassword = requestObject.getIntValue(TYPE) == LOGIN_TYPE_PASSWORD;//登录方式
//			phone = requestObject.getString(PHONE);//手机
//			password = requestObject.getString(PASSWORD);//密码
//
//			if (StringUtil.isPhone(phone) == false) {
//				throw new IllegalArgumentException("手机号不合法！");
//			}
//
//			if (isPassword) {
//				if (StringUtil.isPassword(password) == false) {
//					throw new IllegalArgumentException("密码不合法！");
//				}
//			} else {
//				if (StringUtil.isVerify(password) == false) {
//					throw new IllegalArgumentException("验证码不合法！");
//				}
//			}
//
//			//全局版本号，是否格式化
//			version = requestObject.getIntValue(VERSION);
//			format = requestObject.getBoolean(FORMAT);
//			requestObject.remove(VERSION);
//			requestObject.remove(FORMAT);
//		} catch (Exception e) {
//			return DemoParser.extendErrorResult(requestObject, e);
//		}
//
//
//
//		//手机号是否已注册
//		JSONObject phoneResponse = new DemoParser(HEADS, true).parseResponse(
//				new JSONRequest(
//						new Privacy().setPhone(phone)
//						)
//				);
//		JSONResponse response = new JSONResponse(phoneResponse).getJSONResponse(PRIVACY_);
//		if (JSONResponse.isSuccess(response) == false) {
//			return response;
//		}
//		if(JSONResponse.isExist(response) == false) {
//			return DemoParser.newErrorResult(new NotExistException("手机号未注册"));
//		}
//
//		//根据phone获取User
//		JSONObject privacyResponse = new DemoParser(GETS, true).parseResponse(
//				new JSONRequest(
//						new Privacy().setPhone(phone)
//						)
//				);
//		response = new JSONResponse(privacyResponse);
//
//		Privacy privacy = response == null ? null : response.getObject(Privacy.class);
//		long userId = privacy == null ? 0 : BaseModel.value(privacy.getId());
//		if (userId <= 0) {
//			return privacyResponse;
//		}
//
//		//校验凭证
//		if (isPassword) {//password密码登录
//			response = new JSONResponse(
//					new DemoParser(HEADS, true).parseResponse(
//							new JSONRequest(new Privacy(userId).setPassword(password))
//							)
//					);
//		} else {//verify手机验证码登录
//			response = new JSONResponse(headVerify(Verify.TYPE_LOGIN, phone, password));
//		}
//		if (JSONResponse.isSuccess(response) == false) {
//			return response;
//		}
//		response = response.getJSONResponse(isPassword ? PRIVACY_ : VERIFY_);
//		if (JSONResponse.isExist(response) == false) {
//			return DemoParser.newErrorResult(new ConditionErrorException("账号或密码错误"));
//		}
//
//		response = new JSONResponse(
//				new DemoParser(GETS, true).parseResponse(
//						new JSONRequest(new User(userId))
//						)
//				);
//		User user = response.getObject(User.class);
//		if (user == null || BaseModel.value(user.getId()) != userId) {
//			return DemoParser.newErrorResult(new NullPointerException("服务器内部错误"));
//		}
//
//		//登录状态保存至session
//		session.setAttribute(USER_ID, userId);//用户id
//		session.setAttribute(TYPE, isPassword ? LOGIN_TYPE_PASSWORD : LOGIN_TYPE_VERIFY);//登录方式
//		session.setAttribute(USER_, user);//用户
//		session.setAttribute(PRIVACY_, privacy);//用户隐私信息
//		session.setAttribute(VERSION, version);//全局默认版本号
//		session.setAttribute(FORMAT, format);//全局默认格式化配置
//		//		session.setMaxInactiveInterval(1*60);//设置session过期时间
//
//		return response;
//	}
//
//	@PostMapping(LOGIN)
//	public JSONObject login(HttpSession session){
//				//登录状态保存至session
//		JSONResponse response = new JSONResponse(
//		new DemoParser(GETS, true).parseResponse(
//				new JSONRequest(new MyUser(1L))
//				)
//		);
//		session.setAttribute(USER_ID, 1);//用户id
//		session.setAttribute(TYPE, true ? LOGIN_TYPE_PASSWORD : LOGIN_TYPE_VERIFY);//登录方式
//		session.setAttribute(USER_, new MyUser());//用户
////		session.setAttribute(PRIVACY_, privacy);//用户隐私信息
////		session.setAttribute(VERSION, version);//全局默认版本号
////		session.setAttribute(FORMAT, format);//全局默认格式化配置
//		//		session.setMaxInactiveInterval(1*60);//设置session过期时间
//
//		return response;
//	}

//	/**退出登录，清空session
//	 * @param session
//	 * @return
//	 */
//	@PostMapping("logout")
//	public JSONObject logout(HttpSession session) {
//		long userId;
//		try {
//			userId = DemoVerifier.getVisitorId(session);//必须在session.invalidate();前！
//			Log.d(TAG, "logout  userId = " + userId + "; session.getId() = " + (session == null ? null : session.getId()));
//			session.invalidate();
//		} catch (Exception e) {
//			return DemoParser.newErrorResult(e);
//		}
//
//		JSONObject result = DemoParser.newSuccessResult();
//		JSONObject user = DemoParser.newSuccessResult();
//		user.put(ID, userId);
//		user.put(COUNT, 1);
//		result.put(USER_, user);
//
//		return result;
//	}


	/**
	 * @param requestObject
	 * @param key
	 * @return
	 */
	public static JSONObject newIllegalArgumentResult(JSONObject requestObject, String key) {
		return newIllegalArgumentResult(requestObject, key, null);
	}
	/**
	 * @param requestObject
	 * @param key
	 * @param msg 详细说明
	 * @return
	 */
	public static JSONObject newIllegalArgumentResult(JSONObject requestObject, String key, String msg) {
		return DemoParser.extendErrorResult(requestObject
				, new IllegalArgumentException(key + ":value 中value不合法！" + StringUtil.getString(msg)));
	}

}
