/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.pixtend;

import java.util.List;

import org.openhab.binding.pixtend.internal.PiXtendPort;
import org.openhab.core.binding.BindingProvider;

/**
 * @author Michael Kolb
 * @since 1.7.1
 */
public interface PiXtendBindingProvider extends BindingProvider {

	public List<String> getItemsForDataPort(PiXtendPort port);

	public PiXtendPort getOutPort(String itemName);

}
