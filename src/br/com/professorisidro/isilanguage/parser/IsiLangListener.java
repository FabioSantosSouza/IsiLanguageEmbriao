// Generated from IsiLang.g4 by ANTLR 4.7.1
package br.com.professorisidro.isilanguage.parser;

	import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import br.com.professorisidro.isilanguage.ast.CommandAtribueVector;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import br.com.professorisidro.isilanguage.ast.CommandRepeticao;
	import br.com.professorisidro.isilanguage.ast.CommandFacaEnquanto;
	import br.com.professorisidro.isilanguage.ast.CommandPara;

	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(IsiLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(IsiLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(IsiLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(IsiLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(IsiLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(IsiLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declaraVector}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraVector(IsiLangParser.DeclaraVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declaraVector}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraVector(IsiLangParser.DeclaraVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(IsiLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(IsiLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(IsiLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(IsiLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(IsiLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(IsiLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(IsiLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(IsiLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(IsiLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(IsiLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(IsiLangParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(IsiLangParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#attribVector}.
	 * @param ctx the parse tree
	 */
	void enterAttribVector(IsiLangParser.AttribVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#attribVector}.
	 * @param ctx the parse tree
	 */
	void exitAttribVector(IsiLangParser.AttribVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#attribVectorAtIndex}.
	 * @param ctx the parse tree
	 */
	void enterAttribVectorAtIndex(IsiLangParser.AttribVectorAtIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#attribVectorAtIndex}.
	 * @param ctx the parse tree
	 */
	void exitAttribVectorAtIndex(IsiLangParser.AttribVectorAtIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#vectorAtrExpr}.
	 * @param ctx the parse tree
	 */
	void enterVectorAtrExpr(IsiLangParser.VectorAtrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#vectorAtrExpr}.
	 * @param ctx the parse tree
	 */
	void exitVectorAtrExpr(IsiLangParser.VectorAtrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#termoVector}.
	 * @param ctx the parse tree
	 */
	void enterTermoVector(IsiLangParser.TermoVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#termoVector}.
	 * @param ctx the parse tree
	 */
	void exitTermoVector(IsiLangParser.TermoVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(IsiLangParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(IsiLangParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#condse}.
	 * @param ctx the parse tree
	 */
	void enterCondse(IsiLangParser.CondseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#condse}.
	 * @param ctx the parse tree
	 */
	void exitCondse(IsiLangParser.CondseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdrepeticao}.
	 * @param ctx the parse tree
	 */
	void enterCmdrepeticao(IsiLangParser.CmdrepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdrepeticao}.
	 * @param ctx the parse tree
	 */
	void exitCmdrepeticao(IsiLangParser.CmdrepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#condWhile}.
	 * @param ctx the parse tree
	 */
	void enterCondWhile(IsiLangParser.CondWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#condWhile}.
	 * @param ctx the parse tree
	 */
	void exitCondWhile(IsiLangParser.CondWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdfacaenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdfacaenquanto(IsiLangParser.CmdfacaenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdfacaenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdfacaenquanto(IsiLangParser.CmdfacaenquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#condDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterCondDoWhile(IsiLangParser.CondDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#condDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitCondDoWhile(IsiLangParser.CondDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#cmdpara}.
	 * @param ctx the parse tree
	 */
	void enterCmdpara(IsiLangParser.CmdparaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#cmdpara}.
	 * @param ctx the parse tree
	 */
	void exitCmdpara(IsiLangParser.CmdparaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#attrFor}.
	 * @param ctx the parse tree
	 */
	void enterAttrFor(IsiLangParser.AttrForContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#attrFor}.
	 * @param ctx the parse tree
	 */
	void exitAttrFor(IsiLangParser.AttrForContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#condFor}.
	 * @param ctx the parse tree
	 */
	void enterCondFor(IsiLangParser.CondForContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#condFor}.
	 * @param ctx the parse tree
	 */
	void exitCondFor(IsiLangParser.CondForContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IsiLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicexpr(IsiLangParser.LogicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicexpr(IsiLangParser.LogicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#logicterm}.
	 * @param ctx the parse tree
	 */
	void enterLogicterm(IsiLangParser.LogictermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#logicterm}.
	 * @param ctx the parse tree
	 */
	void exitLogicterm(IsiLangParser.LogictermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(IsiLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(IsiLangParser.TermoContext ctx);
}