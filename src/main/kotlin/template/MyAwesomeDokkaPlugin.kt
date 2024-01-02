package template

import org.jetbrains.dokka.plugability.DokkaPlugin
import org.jetbrains.dokka.plugability.PluginApiPreviewAcknowledgement
import org.jetbrains.dokka.plugability.DokkaPluginApiPreview

class MyAwesomeDokkaPlugin : DokkaPlugin() {

    @DokkaPluginApiPreview
    override fun pluginApiPreviewAcknowledgement() = PluginApiPreviewAcknowledgement
}
