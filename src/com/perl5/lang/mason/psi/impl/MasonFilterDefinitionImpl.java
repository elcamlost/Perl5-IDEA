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

package com.perl5.lang.mason.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IStubElementType;
import com.perl5.lang.mason.psi.MasonFilterDefinition;
import com.perl5.lang.perl.PerlLanguage;
import com.perl5.lang.perl.idea.stubs.subsdefinitions.PerlSubDefinitionStub;
import com.perl5.lang.perl.psi.PerlVariableDeclarationWrapper;
import com.perl5.lang.perl.psi.impl.PerlVariableLightImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hurricup on 08.01.2016.
 */
public class MasonFilterDefinitionImpl extends MasonMethodDefinitionImpl implements MasonFilterDefinition
{
	protected static final String YIELD_VARIABLE_NAME = "$yield";
	protected List<PerlVariableDeclarationWrapper> IMPLICIT_VARIABLES;

	public MasonFilterDefinitionImpl(ASTNode node)
	{
		super(node);
	}

	public MasonFilterDefinitionImpl(PerlSubDefinitionStub stub, IStubElementType nodeType)
	{
		super(stub, nodeType);
	}

	protected void fillImplicitVariables()
	{
		if (isValid() && isPhysical())
		{
			super.fillImplicitVariables();
			getMyImplicitVariables().add(new PerlVariableLightImpl(
					getManager(),
					PerlLanguage.INSTANCE,
					YIELD_VARIABLE_NAME,
					true,
					false,
					false,
					this
			));
		}
	}

	protected List<PerlVariableDeclarationWrapper> getMyImplicitVariables()
	{
		if (IMPLICIT_VARIABLES == null)
		{
			IMPLICIT_VARIABLES = new ArrayList<PerlVariableDeclarationWrapper>();
			fillImplicitVariables();
		}
		return IMPLICIT_VARIABLES;
	}
}