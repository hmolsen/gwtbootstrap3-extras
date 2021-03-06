package org.gwtbootstrap3.extras.card.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.html.Div;

/**
 * @author godi
 */
public class Front extends Div {
    private Trigger trigger;

    public Front() {
        // Add required style names
        addStyleName(CardStyles.FACE);
        addStyleName(CardStyles.FRONT);

        // Add the card to the flip
        trigger = new Trigger();
        super.add(trigger);
    }

    public void setTrigger(IconType iconType) {
        trigger.setType(iconType);
    }
}
