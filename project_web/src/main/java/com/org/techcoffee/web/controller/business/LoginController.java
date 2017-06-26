package com.org.techcoffee.web.controller.business;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.techcoffee.contants.CommonConstants;
import com.org.techcoffee.web.constants.WebContants;
import com.org.techcoffee.web.controller.base.BaseController;

/**
 * 登录画面
 * 
 * @author linliuan
 */
@Controller
@RequestMapping("/Login")
public class LoginController extends BaseController {

    @Resource
    private AdminService adminService;

    /**
     * 进入login画面
     * 
     * @param request
     * @param session
     * @return
     */
    @RequestMapping(value = "/init")
    public String init(Model model, HttpServletRequest request, HttpSession session) {

        try {
            OzTtAdLgDto dto = new OzTtAdLgDto();
            model.addAttribute("ozTtAdLgDto", dto);
            return "OZ_TT_AD_LG";
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            return CommonConstants.ERROR_PAGE;
        }
    }

    /**
     * 用户登录操作
     * 
     * @param model
     * @param request
     * @param session
     * @param loginFormDto
     * @return
     */
    @RequestMapping("login")
    public String login(Model model, HttpServletRequest request, HttpSession session,
            @ModelAttribute OzTtAdLgDto ozTtAdLgDto) {
        
        // 进入登录画面
        String username = ozTtAdLgDto.getUsername();
        String password = ozTtAdLgDto.getPassword();
        TAdminLoginInfo tAdminLoginInfo = adminService.userLogin(username, password);
        if (tAdminLoginInfo == null) {
            // 没有取到数据,清空密码
            ozTtAdLgDto = new OzTtAdLgDto();
            ozTtAdLgDto.setUsername(username);
            // 错误信息
            model.addAttribute("ozTtAdLgDto", ozTtAdLgDto);
            model.addAttribute("cannotLogin", "1");
            return "/OZ_TT_AD_LG";
        }

        // 登录成功插入历史记录
        if (CommonConstants.HAS_LOGINED_STATUS.equals(tAdminLoginInfo.getLoginstatus())) {
            // 用户已经登录着，这时不需要插入历史数据也不需要更新登录表

        }
        else {
            // 插入历史登录数据并且更新登录状态
            TAdminLoginHis tAdminLoginHis = new TAdminLoginHis();
            tAdminLoginHis.setAdminno(tAdminLoginInfo.getAdminno());
            adminService.insertLoginHisAndUpdateStatus(tAdminLoginHis);
        }

        // 可以取到数据，将所用的数据放入session 中
        session.setAttribute(CommonConstants.SESSION_ADMIN_USER_ID, tAdminLoginInfo.getAdminno());

        return "redirect:/OZ_TT_AD_MN/init";

    }

    /**
     * 用户登出
     * 
     * @param model
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("logout")
    public String logout(Model model, HttpServletRequest request, HttpSession session) {
        session.removeAttribute(WebContants.SESSION_ADMIN_USER_ID);
        session.invalidate();
        return "redirect:/main/init";
    }
}
