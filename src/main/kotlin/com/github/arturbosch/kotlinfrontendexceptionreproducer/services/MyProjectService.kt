package com.github.arturbosch.kotlinfrontendexceptionreproducer.services

import com.intellij.openapi.project.Project
import com.github.arturbosch.kotlinfrontendexceptionreproducer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
