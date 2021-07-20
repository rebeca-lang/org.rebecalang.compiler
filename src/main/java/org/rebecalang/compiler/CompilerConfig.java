package org.rebecalang.compiler;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridRebecaSymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridRebecaTypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaTypeSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
@ComponentScan(basePackages = { "org.rebecalang.compiler" })
public class CompilerConfig {
	
	@Autowired
	ApplicationContext appContext;
	
	@Bean
	@Qualifier("TIMED_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SymbolTableInitializer getTimedRebecaSymbolTableInitializer() {
		SymbolTableInitializer symbolTableInitializer = new SymbolTableInitializer(appContext.getBean(TimedRebecaTypeSystem.class));		
		return symbolTableInitializer;
	}
	@Bean
	@Qualifier("PROBABILISTIC_TIMED_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SymbolTableInitializer getProbabilisticTimedRebecaSymbolTableInitializer() {
		return getTimedRebecaSymbolTableInitializer();
	}

	@Bean
	@Qualifier("CORE_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SymbolTableInitializer getCoreRebecaSymbolTableInitializer() {
		SymbolTableInitializer symbolTableInitializer = new SymbolTableInitializer(getCoreRebecaTypeSystem());
		return symbolTableInitializer;
	}
	@Bean
	@Qualifier("PROBABILISTIC_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SymbolTableInitializer getProbabilisticRebecaSymbolTableInitializer() {
		return getCoreRebecaSymbolTableInitializer();
	}
	@Bean
	@Qualifier("HYBRID_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SymbolTableInitializer getHybridRebecaSymbolTableInitializer() {
		SymbolTableInitializer symbolTableInitializer = 
				new HybridRebecaSymbolTableInitializer(appContext.getBean(HybridRebecaTypeSystem.class));
		return symbolTableInitializer;
	}

	protected CoreRebecaTypeSystem getCoreRebecaTypeSystem() {
		CoreRebecaTypeSystem typeSystem = 
				BeanFactoryAnnotationUtils.qualifiedBeanOfType(appContext.getAutowireCapableBeanFactory(), CoreRebecaTypeSystem.class, "CORE_REBECA");
		return typeSystem;
	}
	
	@Bean
	@Qualifier("CORE_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TypeSystemInitializer getCoreRebecaTypeSystemInitializer() {
		TypeSystemInitializer typeSystemInitializer = 
				new TypeSystemInitializer(getCoreRebecaTypeSystem());
		return typeSystemInitializer;
	}
	@Bean
	@Qualifier("PROBABILISTIC_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TypeSystemInitializer getProbabilisticRebecaTypeSystemInitializer() {
		return getCoreRebecaTypeSystemInitializer();
	}
	
	@Bean
	@Qualifier("TIMED_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TypeSystemInitializer getTimedRebecaTypeSystemInitializer() {
		TypeSystemInitializer typeSystemInitializer = 
				new TypeSystemInitializer(appContext.getBean(TimedRebecaTypeSystem.class));
		return typeSystemInitializer;
	}
	@Bean
	@Qualifier("PROBABILISTIC_TIMED_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TypeSystemInitializer getProbabilisticTimedRebecaTypeSystemInitializer() {
		return getTimedRebecaTypeSystemInitializer();
	}
	
	@Bean
	@Qualifier("HYBRID_REBECA")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public HybridRebecaTypeSystemInitializer getHybridRebecaTypeSystemInitializer() {
		HybridRebecaTypeSystemInitializer typeSystemInitializer = 
				new HybridRebecaTypeSystemInitializer(appContext.getBean(HybridRebecaTypeSystem.class));
		return typeSystemInitializer;
	}
	
}