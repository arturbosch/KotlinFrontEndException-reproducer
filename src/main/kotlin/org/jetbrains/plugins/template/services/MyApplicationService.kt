package org.jetbrains.plugins.template.services

import com.axivion.client_data_processing.issue_data_source.IssueKind
import org.jetbrains.plugins.template.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))
        println(IssueKind.values())
    }
}
