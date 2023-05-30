package br.senai.sp.jandira.lion_school.service

import br.senai.sp.jandira.lion_school.model.Course
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CourseService {

    @GET("cursos")
    fun getCourses(): Call<Course>

    @GET("alunos?curso={ds}")
    fun getCursoDs(@Path("sigla") sigla: Int): Call<br.senai.sp.jandira.lion_school.model.Course>

}