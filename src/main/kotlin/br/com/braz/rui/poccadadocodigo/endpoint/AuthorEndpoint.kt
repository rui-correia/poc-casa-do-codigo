package br.com.braz.rui.poccadadocodigo.endpoint

import br.com.braz.rui.poccadadocodigo.dto.NewAuthorRequest
import br.com.braz.rui.poccadadocodigo.service.AuthorService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/author"])
class AuthorEndpoint(private val authorService: AuthorService) {

    @PostMapping
    fun newAuthor(request: NewAuthorRequest): String {

        return "estou no autor"
    }
}