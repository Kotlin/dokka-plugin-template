package template

import org.jetbrains.dokka.plugability.DokkaPlugin
import org.jetbrains.dokka.plugability.PluginApiPreviewAcknowledgement

class MyAwesomeDokkaPlugin : DokkaPlugin() {

    override fun pluginApiPreviewAcknowledgement() = PluginApiPreviewAcknowledgement
}
