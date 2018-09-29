<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateDivisionTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'Division';

    /**
     * Run the migrations.
     * @table Division
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('divisionid');
            $table->unsignedInteger('deporteid')->nullable();
            $table->string('nombre', 200)->nullable();

            $table->index(["deporteid"], 'deporteid_idx');


            $table->foreign('deporteid', 'deporteid_idx')
                ->references('deporteid')->on('Deporte')
                ->onDelete('no action')
                ->onUpdate('no action');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
     public function down()
     {
       Schema::dropIfExists($this->set_schema_table);
     }
}
