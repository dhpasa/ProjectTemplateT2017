package com.org.oztt.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.oztt.base.constants.Constants;
import com.org.oztt.base.respond.TcResponse;
import com.org.oztt.test.respondDto.RespondPerson;

/**
 * @author Ron.Lin
 */
@RestController
public class PersonController extends BaseController {

    /**
     * 获取积分记录信息
     * 
     * @param jsonReq
     * @return
     */
    @RequestMapping(value = "/Person", method = RequestMethod.GET)
    @ResponseBody
    public TcResponse getAllPerson() {
        try {
            //这里需要验证数据的完整性和token,API的接口check需要严密
            //TODO
            RespondPerson rp = new RespondPerson();
            //        	PagingResult<Person> pageResult = personService.getPersons(new HashMap<Object, Object>(), null);
            //        	// 这里需要对返回值做处理，
            //        	rp.setResDtoList(pageResult.getResultList());
            return rp;
        }
        catch (Exception ex) {
            log.error("meesage", ex);
            return new TcResponse();
        }
    }
}
