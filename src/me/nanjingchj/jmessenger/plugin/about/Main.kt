package me.nanjingchj.jmessenger.plugin.about

import jmessenger.client.AbstractPlugin
import jmessenger.shared.Message
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JPanel

class Main : AbstractPlugin() {
    override fun onMessageReceived(p0: Message) {}
    override fun onMessageSent(p0: Message) {}
    override fun onClose() {}
    override fun onStart() {}

    override fun getCustomJComponent(): JComponent? {
        val pnl = JPanel(GridBagLayout())
        pnl.name = "About"

        var c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 0
        c.weightx = 1.0
        c.weighty = 0.0
        c.ipady = 100
        c.fill = GridBagConstraints.BOTH
        pnl.add(JButton("Image"), c)

        c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 1
        c.weightx = 1.0
        c.weighty = 0.0
        c.ipady = 200
        c.fill = GridBagConstraints.BOTH
        pnl.add(JButton("Information"), c)

        // the spring
        c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 2
        c.weightx = 1.0
        c.weighty = 1.0
        c.fill = GridBagConstraints.BOTH
        pnl.add(JButton("I am a spring"), c)
        return pnl
    }
}