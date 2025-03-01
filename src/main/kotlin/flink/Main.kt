package flink

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment

fun main() {
    val env = StreamExecutionEnvironment.getExecutionEnvironment()
    val input = env.socketTextStream("localhost", 9999)

    val processed = input.map {
        "Processed: $it"
    }

    processed.print()
    env.execute("Console input example")
}