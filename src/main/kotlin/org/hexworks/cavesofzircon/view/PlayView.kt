package org.hexworks.cavesofzircon.view

import org.hexworks.zircon.api.ColorThemes
import org.hexworks.zircon.api.Components
import org.hexworks.zircon.api.component.ComponentAlignment
import org.hexworks.zircon.api.graphics.BoxType
import org.hexworks.zircon.api.mvc.base.BaseView

class PlayView : BaseView() {

    override val theme = ColorThemes.arc()

    override fun onDock() {

        val loseButton = Components.button()
                .withAlignmentWithin(screen, ComponentAlignment.LEFT_CENTER)
                .withText("Lose!")
                .wrapSides(false)
                .withBoxType(BoxType.SINGLE)
                .wrapWithShadow()
                .wrapWithBox()
                .build()

        val winButton = Components.button()
                .withAlignmentWithin(screen, ComponentAlignment.RIGHT_CENTER)
                .withText("Win!")
                .wrapSides(false)
                .withBoxType(BoxType.SINGLE)
                .wrapWithShadow()
                .wrapWithBox()
                .build()

        screen.addComponent(loseButton)
        screen.addComponent(winButton)
    }
}