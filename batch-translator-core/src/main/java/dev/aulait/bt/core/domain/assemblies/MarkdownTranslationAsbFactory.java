package dev.aulait.bt.core.domain.assemblies;

import dev.aulait.bt.core.domain.file.MarkdownParagraphResolver;
import dev.aulait.bt.core.domain.file.ParagraphGroup;
import dev.aulait.bt.core.domain.file.ParagraphResolver;
import dev.aulait.bt.core.domain.translation.BasicTranslatorFactory;
import dev.aulait.bt.core.domain.translation.Translator;
import dev.aulait.bt.core.infrastructure.command.TranslationEngine;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MarkdownTranslationAsbFactory extends TranslationAssembliesFactory {

  private final TranslationEngine engine;

  @Override
  public ParagraphResolver getParagraphResolver() {
    return new MarkdownParagraphResolver();
  }

  @Override
  public ParagraphGroup getParagraphGroup() {
    return new ParagraphGroup(true);
  }

  @Override
  public Translator getTranslator() {
    return BasicTranslatorFactory.createTranslator(this.engine);
  }
}
