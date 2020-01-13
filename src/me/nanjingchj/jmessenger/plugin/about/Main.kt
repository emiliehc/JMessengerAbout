package me.nanjingchj.jmessenger.plugin.about

import jmessenger.client.AbstractPlugin
import jmessenger.client.Messenger
import jmessenger.client.SplashScreen
import jmessenger.shared.Message
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Image
import java.awt.event.ComponentEvent
import java.awt.event.ComponentListener
import javax.swing.*

class Main : AbstractPlugin() {
    override fun onMessageReceived(p0: Message) {}
    override fun onMessageSent(p0: Message) {}
    override fun onClose() {}
    override fun onStart() {}

    override fun getCustomJComponent(): JComponent? {
        val pnl = JPanel(GridBagLayout())
        pnl.name = "About"

        val image = ImageIcon(ImageIcon(SplashScreen::class.java.getResource("splash.png")).image.getScaledInstance(658 / 2, 439 / 2, Image.SCALE_SMOOTH))

        var c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 0
        c.weightx = 1.0
        c.weighty = 0.2
        c.ipady = 0
        c.fill = GridBagConstraints.BOTH
        val lblImg = JLabel()
        lblImg.icon = image
        lblImg.addComponentListener(object : ComponentListener {
            override fun componentMoved(e: ComponentEvent?) {}
            override fun componentHidden(e: ComponentEvent?) {}
            override fun componentShown(e: ComponentEvent?) {}

            override fun componentResized(e: ComponentEvent?) {
                lblImg.icon = ImageIcon(ImageIcon(SplashScreen::class.java.getResource("splash.png")).image.getScaledInstance(lblImg.width, (lblImg.width / 658.0 * 439).toInt(), Image.SCALE_SMOOTH))
            }
        })
        pnl.add(lblImg, c)

        c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 1
        c.weightx = 1.0
        c.weighty = 0.0
        c.ipady = 0
        c.fill = GridBagConstraints.BOTH
        val lblInfo = JLabel()
        lblInfo.text = """
            <html>
                <h1>&ensp
                    JMessenger
                </h1>
                <h3>&emsp
                    Version %version
                </h3>
                <p>&emsp&nbsp
                    Created by
                </p>
                <p><b>&emsp&nbsp
                    Frank Chen
                </b></p>
                <p>&emsp&nbsp
                    and
                </p>
                <p><b>&emsp&nbsp
                    Gary Gao
                </b></p>
                <p></p>
                <p>&emsp&nbsp
                    Logo and Splash Screen designed by <b>Gary Gao</b>
                </p>
            </html>
        """.trimIndent().replace("%version", Messenger.version)
        pnl.add(lblInfo, c)

        // the spring that pushes everything upward
        c = GridBagConstraints()
        c.gridx = 0
        c.gridy = 2
        c.weightx = 1.0
        c.weighty = 1.0
        c.fill = GridBagConstraints.BOTH
        pnl.add(JLabel(), c)
        return pnl
    }
}