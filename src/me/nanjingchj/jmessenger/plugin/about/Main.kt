package me.nanjingchj.jmessenger.plugin.about

import jmessenger.client.AbstractPlugin
import jmessenger.shared.Message
import javax.swing.JComponent
import javax.swing.JPanel

class Main : AbstractPlugin() {
    override fun onMessageReceived(p0: Message) {}
    override fun onMessageSent(p0: Message) {}
    override fun onClose() {}
    override fun onStart() {}

    override fun getCustomJComponent(): JComponent? {
        val pnl = JPanel()
        pnl.name = "About"

        return pnl
    }
}