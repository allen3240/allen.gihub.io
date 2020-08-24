package controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.memberdao;
import dao.memberim;
import model.member;

@Controller
@RequestMapping("api")
public class memberController {
	
	private memberim md;
	@RequestMapping(value="user/set")
	public void setMemberdao(memberim md)
	{
		this.md=md;
	}
	
	@RequestMapping(value="user/select")
	public String selectByid(String id)
	{
		System.out.println("id="+id);
		return "list.html";
	}
	@GetMapping("test")
    @ResponseBody
    public Map<String, Object> test() {
        Map<String, Object> data = new HashMap<>();
        data.put("a", "10");
        data.put("b", 20);
        data.put("c", new String[] {"foo", "orz"});
        data.put("d", new Date());
        return data;
    }

}
