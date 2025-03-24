package com.github.mrf7.ideplugin.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.github.mrf7.ideplugin.MyBundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Service(Service.Level.PROJECT)
class MyProjectService(project: Project, val scope: CoroutineScope) {

    init {
        thisLogger().info(MyBundle.message("projectService", project.name))
        thisLogger().warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
        scope.launch {
            delay(1000)
            println("Done")
        }
    }

    fun getRandomNumber() = (1..100).random()
}
