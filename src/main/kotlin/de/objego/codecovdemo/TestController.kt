package de.objego.codecovdemo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping(value = ["/test"])
class TestController {
    @GetMapping
    fun getTestData(): ModelAndView {
        val mv = ModelAndView()
        mv.viewName = "welcome"
        mv.model["data"] = "Welcome home man"
        return mv
    }
}
