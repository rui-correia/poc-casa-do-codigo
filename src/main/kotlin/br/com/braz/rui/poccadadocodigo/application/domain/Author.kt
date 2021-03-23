package br.com.braz.rui.poccadadocodigo.application.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
import kotlin.properties.Delegates

@Entity
data class Author(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
//    @NotBlank
//    val name: String,
//    @Email
//    @NotBlank
//    val email: String,
//    @NotBlank
//    @Size(max = 400)
//   lateinit var description: String,
    val creationDate: LocalDate = LocalDate.now()
) {
    public constructor(name: String, email: String, description: String): this(){
        this.name = name
        this.email = email
        this.description = description
    }
    lateinit var name: String
    lateinit var email: String
    lateinit var description: String



}