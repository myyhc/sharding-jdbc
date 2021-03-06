/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.core.parsing.parser.dialect.sqlserver.clause.facade;

import io.shardingjdbc.core.parsing.lexer.LexerEngine;
import io.shardingjdbc.core.parsing.parser.clause.DistinctClauseParser;
import io.shardingjdbc.core.parsing.parser.clause.GroupByClauseParser;
import io.shardingjdbc.core.parsing.parser.clause.HavingClauseParser;
import io.shardingjdbc.core.parsing.parser.clause.facade.AbstractSelectClauseParserFacade;
import io.shardingjdbc.core.parsing.parser.dialect.sqlserver.clause.SQLServerOrderByClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.sqlserver.clause.SQLServerSelectListClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.sqlserver.clause.SQLServerSelectRestClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.sqlserver.clause.SQLServerTableReferencesClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.sqlserver.clause.SQLServerWhereClauseParser;
import io.shardingjdbc.core.rule.ShardingRule;

/**
 * Select clause parser facade for SQLServer.
 *
 * @author zhangliang
 */
public final class SQLServerSelectClauseParserFacade extends AbstractSelectClauseParserFacade {
    
    public SQLServerSelectClauseParserFacade(final ShardingRule shardingRule, final LexerEngine lexerEngine) {
        super(new DistinctClauseParser(lexerEngine), new SQLServerSelectListClauseParser(shardingRule, lexerEngine),
                new SQLServerTableReferencesClauseParser(shardingRule, lexerEngine), new SQLServerWhereClauseParser(lexerEngine), new GroupByClauseParser(lexerEngine),
                new HavingClauseParser(lexerEngine), new SQLServerOrderByClauseParser(lexerEngine), new SQLServerSelectRestClauseParser(lexerEngine));
    }
}
