package com.perl5.lang.pod;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by hurricup on 24.04.2015.
 */
public class PodElementType extends PodTokenType
{
	public PodElementType(@NotNull @NonNls String debugName) {
		super(debugName);
	}

	@Override
	public String toString() {
		return "PodElementType." + super.toString();
	}
}
