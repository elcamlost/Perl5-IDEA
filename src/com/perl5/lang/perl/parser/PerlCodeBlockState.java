package com.perl5.lang.perl.parser;

import java.util.HashMap;

/**
 * Created by hurricup on 04.05.2015.
 */
public class PerlCodeBlockState
{

	protected HashMap<String, PerlPackagePragma> pragmas = new HashMap<String, PerlPackagePragma>();

	protected PerlSub subDefinition;
	protected PerlSub subDeclaration;
	protected PerlPackage namespace;

	protected final PerlSyntaxTrap stringsTrap = new PerlSyntaxTrap();

	public PerlCodeBlockState()
	{
		pragmas.put("features", new PerlPackagePragmaFeatures());
	}

	public PerlCodeBlockState(PerlCodeBlockState original)
	{
		namespace = original.getNamespace();
		for( PerlPackagePragma pragma: original.getPragmas().values())
		{
			if( pragma instanceof PerlPackagePragmaFeatures )
				pragmas.put(pragma.getName(), new PerlPackagePragmaFeatures((PerlPackagePragmaFeatures)pragma));
			else
				pragmas.put(pragma.getName(), new PerlPackagePragma(pragma));
		}
	}


	/**
	 * Applying positive change to current state: use ...
	 * @param c state change object
	 */
	public void use(PerlUseParameters c)
	{
		if( "feature".equals(c.getPackageName()))
		{
			getFeatures().use(c);
		}
	}

	/**
	 * Applying negative change to the current state: no ...
	 * @param c state change object
	 */
	public void no(PerlUseParameters c)
	{
		if( "feature".equals(c.getPackageName()))
		{
			getFeatures().no(c);
		}
	}

	// getters and setters
	public PerlSyntaxTrap getStringsTrap()
	{
		return stringsTrap;
	}

	public PerlSub getSubDefinition()
	{
		return subDefinition;
	}

	public PerlSub getSubDeclaration()
	{
		return subDeclaration;
	}

	public void setSubDefinition(PerlSub subDefinition)
	{
		this.subDefinition = subDefinition;
	}

	public void setSubDeclaration(PerlSub subDeclaration)
	{
		this.subDeclaration = subDeclaration;
	}

	public HashMap<String, PerlPackagePragma> getPragmas()
	{
		assert pragmas != null;
		return pragmas;
	}

	public PerlPackagePragmaFeatures getFeatures()
	{
		return (PerlPackagePragmaFeatures)getPragmas().get("feature");
	}

	public boolean isPragma(String name)
	{
		return pragmas.get(name) != null;
	}

	public PerlPackage getNamespace()
	{
		assert namespace != null;
		return namespace;
	}

	public void setNamespace(PerlPackage namespace)
	{
		this.namespace = namespace;
	}
}
