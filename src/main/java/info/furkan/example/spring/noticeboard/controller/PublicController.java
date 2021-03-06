package info.furkan.example.spring.noticeboard.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import info.furkan.example.spring.noticeboard.dto.MessageDto;
import info.furkan.example.spring.noticeboard.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PublicController {

	@Autowired
	private MessageService messageService;

	@GetMapping
	public String index(Model model) {
		List<MessageDto> messages = messageService.findPublished(this.getCurrentTime());
		model.addAttribute("messages", messages);
		return "public/index";
	}

	@GetMapping("/login")
	public String login(Boolean error, Model model) {
		if (Objects.nonNull(error) && error.equals(Boolean.TRUE)) {
			model.addAttribute("error", true);
		} else {
			model.addAttribute("error", false);
		}
		return "public/login";
	}

	private LocalDateTime getCurrentTime() {
		return LocalDateTime.now();
	}

}
