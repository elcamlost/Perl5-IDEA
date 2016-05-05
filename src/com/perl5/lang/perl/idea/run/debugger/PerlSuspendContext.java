/*
 * Copyright 2016 Alexandr Evstigneev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.perl5.lang.perl.idea.run.debugger;

import com.intellij.xdebugger.frame.XExecutionStack;
import com.intellij.xdebugger.frame.XSuspendContext;
import com.perl5.lang.perl.idea.run.debugger.protocol.PerlDebuggingEventStackFrame;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;

/**
 * Created by hurricup on 04.05.2016.
 */
public class PerlSuspendContext extends XSuspendContext
{
	private final XExecutionStack myXExecutionStack;

	public PerlSuspendContext(PerlDebuggingEventStackFrame[] eventStackFrames)
	{
		myXExecutionStack = new PerlExecutionStack(eventStackFrames);
	}

	@Nullable
	@Override
	public XExecutionStack getActiveExecutionStack()
	{
		return myXExecutionStack;
	}

	@Override
	public void computeExecutionStacks(XExecutionStackContainer container)
	{
		container.addExecutionStack(Collections.singletonList(myXExecutionStack), true);
	}


}