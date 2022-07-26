package com.github.tughour.sampleplugin.services

import com.intellij.openapi.project.Project
import com.github.tughour.sampleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
